public class Triangle{

    private int xA;         //x coordinates of vertex A
    private int xB;         //x coordinates of vertex B
    private int xC;         //x coordinates of vertex C
    private int yA;         //y coordinates of vertex A
    private int yB;         //y coordinates of vertex B
    private int yC;         //y coordinates of vertex C
    private int vectorABX;
    private int vectorBCX;
    private int vectorACX;
    private int vectorABY;
    private int vectorBCY;
    private int vectorACY;
    private double edgeAB;
    private double edgeBC;
    private double edgeAC;

    public  Triangle(int xA, int xB, int xC, int yA, int yB, int yC) {
        this.xA = xA;
        this.xB = xB;
        this.xC = xC;
        this.yA = yA;
        this.yB = yB;
        this.yC = yC;
        getAllValueForTriangle();
    }

    public void getAllValueForTriangle(){
        vectorABX = xA - xB;
        vectorBCX = xB - xC;
        vectorACX = xA - xC;
        vectorABY = yA - yB;
        vectorBCY = yB - yC;
        vectorACY = yA - yC;
        edgeAB = getEdgeLength(vectorABX, vectorABY);
        edgeBC = getEdgeLength(vectorBCX, vectorBCY);
        edgeAC = getEdgeLength(vectorACX , vectorACY);
    }

    public double getEdgeLength(int vectorX, int vectorY) {
        return Math.sqrt((vectorX * vectorX) + (vectorY * vectorY));
    }

    public String getType() {

        if (isSquareIsosceles()) {
            return "SQUARE_ISOSCELES";
        } else if (isEquilateral()) {
            return "EQUILATERAL";
        } else if (isSquare()) {
            return "SQUARE";
        } else if (isIsosceles()) {
           return "ISOSCELES";
        }else {
            return "NORMAL";
        }
    }

    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - edgeAB) * (p - edgeAC) * (p - edgeBC));
    }

    public double getPerimeter() {
        return (edgeAB + edgeAC + edgeBC);
    }

    public boolean isSquare() {
        return (vectorABX * vectorACX + vectorABY * vectorACY == 0
                    || vectorABX * vectorBCX + vectorABY * vectorBCY == 0
                    || vectorACX * vectorBCX + vectorACY * vectorBCY == 0);
    }

    public boolean isIsosceles() {
        long edgeABPow2 = vectorABX * vectorABX + vectorABY * vectorABY;
        long edgeACPow2 = vectorACX * vectorACX + vectorACY * vectorACY;
        long edgeBCPow2 = vectorBCX * vectorBCX + vectorBCY * vectorBCY;
        return edgeABPow2 == edgeACPow2 || edgeABPow2 == edgeBCPow2 || edgeBCPow2 == edgeACPow2;
    }

    public boolean isSquareIsosceles() {
        return (isSquare() && isIsosceles());
    }

    public boolean isEquilateral() {
        long edgeABPow2 = vectorABX * vectorABX + vectorABY * vectorABY;
        long edgeACPow2 = vectorACX * vectorACX + vectorACY * vectorACY;
        long edgeBCPow2 = vectorBCX * vectorBCX + vectorBCY * vectorBCY;
        return edgeABPow2 == edgeACPow2 && edgeBCPow2 == edgeACPow2;
    }
}