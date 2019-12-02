package com.hz;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        //C盘
        Folder rootFolder = new Folder("C:");

        //文件夹dong和文件dong.txt
        Folder dongFolder = new Folder("dong");
        File dongFile = new File("dong.txt");

        //将上面的文件和文件夹添加到root中
        rootFolder.add(dongFolder);
        rootFolder.add(dongFile);

        Folder chuanFolder = new Folder("chuan");
        File chuanFile = new File("chuan.txt");
        dongFolder.add(chuanFolder);
        dongFolder.add(chuanFile);

        displayTree(rootFolder, 0);

        System.out.println("========================");

        rootFolder.remove(dongFolder);
        displayTree(rootFolder, 0);
    }

    //*****递归
    public static void displayTree(IFile root, int deep) {

        for (int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        //显示当前文件名称
        root.display();

        //获取当前子节点
        List<IFile> children = root.getChild();

        //递归
        for (IFile file : children) {
            if (file instanceof File) {
                for (int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                file.display();
            } else {
                displayTree(file, deep + 1);
            }
        }
    }
}