package JavaClass.day3;

public interface Retail {
    float getCosmaticsTotalCost(int numberOfItems, int price, float tax);

    float getPerfumesTotalCost(int numberOfItems, int price, float tax);

    float getClothsTotalCost(int numberOfItems, int price, float tax);

    float getTotalExtendedCost(float totalCosmaticsCost, float totalPerfumesCost, float totalClothsCost);

    float getTotalDicountCost(float totalCost);
}
