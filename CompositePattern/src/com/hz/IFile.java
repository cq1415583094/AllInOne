package com.hz;

import java.util.List;

/**
 * 文件系统接口
 * 文件和文件夹
 */
public interface IFile {
    //显示
    void display();

    //增加
    boolean add(IFile iFile);

    //移出
    boolean remove(IFile iFile);

    //获取子节点
    List<IFile> getChild();
}