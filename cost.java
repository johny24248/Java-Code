class cost {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99f;
        float TotalCost = items * costPerItem;
        char Currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem);
        System.out.println("Total cost = " + TotalCost);
    }
}