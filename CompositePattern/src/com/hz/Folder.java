package com.hz;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 */
public class Folder implements IFile {
    private String name;
    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }

    @Override
    public boolean add(IFile iFile) {
        return this.children.add(iFile);
    }

    @Override
    public boolean remove(IFile iFile) {
        return this.children.remove(iFile);
    }

    @Override
    public List<IFile> getChild() {
        return this.children;
    }
}