public class Tests {
    public static void main(String[] args) {
        for(int i= 1;i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int n = i * 100 + j * 10 + k;
                    if (n == i * i * i + k * k * k + j * j * j) {
                        System.out.println(n);
                    }
                }
            }
        }
    }
}

