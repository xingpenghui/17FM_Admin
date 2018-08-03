package com.feri.util;

import java.util.UUID;

/**
 *@Author feri
 *@Date Created in 2018/8/3 18:00
 */
public class FileUtil {
    //文件名命名
    public static String getFileName(String filename){
        if(filename.length()>50){
            filename=filename.substring(filename.length()-50);
        }
        return UUID.randomUUID().toString().replace("-","")+"_"+filename;
    }
}
