package com.company;

public class JackOLantern{

    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    // Edits one of the strings in the faceFeatures array
    public void edit(String replace, int row, int column) {
        faceFeatures[row][column] = replace;
    }

    // Fills the faceFeatures array with a single string
    public void fill(String str){
        for(int i = 0; i < faceFeatures.length; i++){
            for(int j = 0; j < faceFeatures[i].length; j++){
                faceFeatures[i][j] = str;
            }
        }
    }

    // Prints out the face row by row
    public String toString(){
        return this.faceFeatures.toString();
    }
}
