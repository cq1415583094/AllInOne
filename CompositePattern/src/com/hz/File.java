package com.hz;

import java.util.List;

/**
 * 文件
 */
public class File implements IFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public boolean add(IFile iFile) {
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return null;
    }
}