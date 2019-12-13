package com.study.fileExe;

import java.io.File;

/**
 * 描述:在D盘下创建一个名为ccc的文件夹，要求如下：
 * 1.ccc文件夹中要求包含bbb子文件夹
 * 2.bbb子文件夹要求包含aaa文件夹
 */
public class FileExe4 {
    public static void main(String[] args) {
        File file = new File("c:\\ccc\\bbb\\aaa");
        file.mkdirs();
    }
}
