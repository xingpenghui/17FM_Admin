package com.feri.web.controller;

import com.feri.pojo.Goods;
import com.feri.service.GoodsService;
import com.feri.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 *@Author feri
 *@Date Created in 2018/8/3 17:49
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService service;

    //新增
    @PostMapping("/goodssave.do")
    public String save(@RequestParam("picture") CommonsMultipartFile multipartFile, Goods goods, Model model, HttpServletRequest request) throws IOException {
        if (!multipartFile.isEmpty()) {
            //文件夹
            File dir = new File(new File(request.getServletContext().getRealPath("/")).getParent(), "17fmpics");
            if(!dir.exists()){
                dir.mkdirs();
            }
            //需要存储的文件对象
            File tarFile = new File(dir, FileUtil.getFileName(multipartFile.getOriginalFilename()));
            //存储到服务器指定路径
            multipartFile.transferTo(tarFile);
            goods.setPicurl(tarFile.getName());
            System.err.println("文件上传路径："+tarFile.getAbsolutePath());
            if (service.save(goods)) {

                return "admin.jsp";
            }
        }
        model.addAttribute("msg", "服务器繁忙，稍后再来！");
        return "addGoods.jsp";
    }

}
