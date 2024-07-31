package com.hypredge;

public class CopyFile {
    public void copyFile(CopyFileRequest request) {
        System.out.println("Copying file from " + request.getSourceFile() + " to " + request.getDestinationFile());
    }
}
