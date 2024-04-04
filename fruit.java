public class Fruit {
    int stock;
    
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void stockStatus(){
        //print stock status
        if (stock < 100) {
            System.out.println("Fill up the fruits!");
        } else {
            System.out.println("It's selling time baby!");
        }
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setStock(50);

        Fruit orange = new Fruit();
        orange.setStock(75);

        Fruit wMelon = new Fruit();
        wMelon.setStock(150);

        // Call stockStatus directly on each object
        apple.stockStatus(); 
        orange.stockStatus();
        wMelon.stockStatus();
    }
}
