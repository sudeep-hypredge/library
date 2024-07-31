package com.hypredge;

public class CopyFileRequest
{
    String sourceFile;
    String destinationFile;

    public String getSourceFile() {
        return this.sourceFile;
    }

    public String getDestinationFile() {
        return this.destinationFile;
    }

    private CopyFileRequest(Builder builder) {
        this.sourceFile = builder.sourceFile;
        this.destinationFile = builder.destinationFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String sourceFile;
        private String destinationFile;

        private Builder() {
        }

        public Builder sourceFile(String sourceFile) {
            this.sourceFile = sourceFile;
            return this;
        }

        public Builder destinationFile(String destinationFile) {
            this.destinationFile = destinationFile;
            return this;
        }

        public CopyFileRequest build() {
            return new CopyFileRequest(this);
        }
    }
}
