package JavaClass.day3;

import java.util.Scanner;

public class Company implements Retail{
    float cosmaticCost;
    int perfumeCost;
    int clothsCost;

    @Override
    public float getTotalExtendedCost(float totalCosmaticsCost, float totalPerfumesCost, float totalClothsCost) {
        // TODO Auto-generated method stub
        float totalCost = (totalClothsCost + totalCosmaticsCost + totalPerfumesCost);

        return totalCost;
    }

    @Override
    public float getTotalDicountCost(float totalCost) {
        // TODO Auto-generated method stub
        float discout = (totalCost * 2/100);

        return discout;
    }

    @Override
    public float getCosmaticsTotalCost(int numberOfItems, int price, float tax) {
        // TODO Auto-generated method stub
        // System.out.println("Please Enter Number of items");
        // Scanner sc = new Scanner(System.in);
        // numberOfItems = sc.nextInt();

        //float costmaticCost;
        float costmaticCost = ((numberOfItems * price) * tax/100) + (numberOfItems * price);
        
         //= totalCost;
         //System.out.println(costmaticCost);
        return costmaticCost;
    }

    @Override
    public float getPerfumesTotalCost(int numberOfItems, int price, float tax) {
        // TODO Auto-generated method stub

        float totalCost = ((numberOfItems * price) * tax/100) + (numberOfItems * price);
        
        return totalCost;
        
    }

    @Override
    public float getClothsTotalCost(int numberOfItems, int price, float tax) {
        // TODO Auto-generated method stub
        float totalCost = ((numberOfItems * price) * ((tax/100))) + (numberOfItems * price);
        
        return totalCost;
    }

    public static void main(String args[]){
        Company cost = new Company();

        System.out.println("Please Enter Number of Cosmatics items");
        Scanner sc = new Scanner(System.in);
        int costmatics = sc.nextInt();
        System.out.println("Please Enter Number of Perfumes items");
        int perfumes = sc.nextInt();
        System.out.println("Please Enter Number of Cloths items");
        int cloths = sc.nextInt();
        

        float cosmaticsCost = cost.getCosmaticsTotalCost(costmatics, 200, 12);
        System.out.println(cosmaticsCost);
        float perfumesCost = cost.getPerfumesTotalCost(perfumes, 200, 12);
        System.out.println(perfumesCost);
        float clothsCost = cost.getCosmaticsTotalCost(cloths, 200, 12);
        System.out.println(clothsCost);

        float extendedCost = cost.getTotalExtendedCost(cosmaticsCost, perfumesCost, clothsCost);
        System.out.println(extendedCost);

        float toatalDiscout = cost.getTotalDicountCost(extendedCost);
        System.out.println(toatalDiscout);

    }
    
}
