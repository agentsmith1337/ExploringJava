public class nDarray {
    public static void main(String[] args) {
        int array[][][];
        array = new int[4][5][6];
        //Initialise the elements 
        System.out.println("Following is a 3D Array.");
        for (int i=0;i<4;i++) { //Page 
            System.out.println("Observe the schema,i="+i+" is added to j+k");
            for (int j=0;j<5;j++) { //Row
                for (int k=0; k<6;k++) { //Column
                    array[i][j][k]=i+j+k;
                    System.out.print(array[i][j][k]+" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        System.out.println("Three dimensional arrays can be thought of as Pages with tabled content.");
        System.out.println("Four dimensional arrays can be thought of books with pages where each page has tabled content.");
        System.out.println("Five dimensional arrays can be thought of as shelves with books with pages where each shelf has several books,\neach book has several pages and each page has tabled content.");
        System.out.println("Now, let us have a look at a 4D Array. Hold on!");
        
        /*4D Matrix(Array)*/
        int matrix[][][][];
        matrix = new int [3][3][4][5];
        System.out.println("The following is a 4D Matrix (Array)");
        //First exhaust l for each page then move to next page till pages are exhausted. then move to the next row.
        for (int i=0; i<3; i++) { //Book
            System.out.println("Book number:"+i);
            for (int k=0; k<4; k++) { //Row
                for (int j=0; j<3; j++) { //Page
                    for (int l=0; l<5; l++) { //Column
                        matrix[i][j][k][l]=i+j+k+l;
                        System.out.print(matrix[i][j][k][l]+" ");
                        
                    }
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
        System.out.println("We can observe the entries to be correct using the i+j+k+l statement employed.");
        /*5D Matrix (Array)*/
        System.out.println("\nWe have employed the projection concept to translate the various dimensions of our arrays so that they can be put into use,\natleast in computer science where numbers can be discrete in a system.");
        int D5Matrix[][][][][];
        D5Matrix = new int [2][3][4][5][6];
        /*We decide to present the shelf dimension in row form, as we did with pages in the 4D Array*/
        
        for (int j=0; j<3; j++) { //Books
            for (int l=0; l<5; l++) { //Rows
                for (int i=0; i<2; i++) { //Shelves 
                    for (int k=0; k<4; k++) { //Pages
                        for (int m=0; m<5; m++) { //Columns
                            D5Matrix[i][j][k][l][m]=i+j+k+l+m;
                            System.out.print(D5Matrix[i][j][k][l][m]+" "); 
                        }
                        System.out.print(" ");
                    }
                System.out.print("|| "); //Shelf Divider
                } 
            System.out.print("\n");    
            }
        System.out.print("\n");
        }
        System.out.println("Keeping the space management problem aside for now, we have succeeded in printing a 5D array in form of stacked shelves, where each shelf has its books.");
    }
}
