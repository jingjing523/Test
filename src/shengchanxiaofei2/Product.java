package shengchanxiaofei2;

public class Product {//商品
    //品牌
    private String brand;
    //姓名
    private String name;

    boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //生产商品
    public synchronized void setProduct(String brand, String name) {
        if (flag == true) {//灯是红色，不生产
            try {
                wait();//Object类中
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            //如果灯是绿色，生产
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            System.out.println("生产者生产了：" + this.getBrand() + "-------" + this.getName());
            //生产完了
            flag = true;
            //告诉消费者来消费
            notify();//Object类中

    }

        //消费商品
        public synchronized void getProduct(){
            if (flag==false){//是绿色
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //开始消费
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("消费者消费了：" + this.getBrand() + "--------" + this.getName());
                //消费结束,等变成绿色
        flag = false;
        notify();
        }
    }


