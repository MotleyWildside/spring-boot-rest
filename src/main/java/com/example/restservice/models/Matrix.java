package com.example.restservice.models;

public class Matrix {
    public int[][] matrix;
    
    public int[][] transparent() {
        int[][] transparentedMatrix = new int[3][3];

        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                transparentedMatrix[j][i] = this.matrix[i][j];
            }
        }

        return transparentedMatrix;
    }

    public void print() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
