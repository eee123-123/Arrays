package Commu;

public class ConSumeRunnable implements Runnable{
    //private Product product=new Product();
    private Product product;

    public ConSumeRunnable() {
    }

    public ConSumeRunnable(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("消费者消费一个商品"+product.getName()+"  "+product.getColor());
    }
}
