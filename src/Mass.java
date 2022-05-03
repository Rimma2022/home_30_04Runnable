import java.util.Arrays;
public class Mass extends Thread {
    private int[] mass;
    private int size;
    private double avg;
    private double sum;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Mass(int[] mass) {
        this.mass = mass;
    }

    public Mass(int size) {
        this.size = size;
    }

    public int[] getMass() {
        return mass;
    }

    public void setMass(int[] mass) {
        this.mass = mass;
    }

    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        if ("Generate".equals(currentThreadName)) {
            generateMass();
        } else if ("Avg".equals(currentThreadName)) {
            x();
        } else if ("Sum".equals(currentThreadName)) {
            y();
        }
//        while (true) {
//            if (Thread.currentThread().isInterrupted()) {
//                System.out.println("Конец потока!");
//            } else {
//                System.out.println("поток выполняется");
//            }
//        }
    }

    public void generateMass() {
        this.mass = new int[size];
        for (int i = 0; i < size; i++) {
            this.mass[i] = (int) (Math.random() * 10);
            this.setMass(mass);
        }
        System.out.println(Arrays.toString(this.mass));
    }

    public void x() {
        for (int i = 0; i < size; i++) {
            sum += mass[i];
        }
        System.out.println("Сумма массива равна: " + sum);
    }

    public void y() {
        for (int i = 0; i < this.getMass().length; i++) {
            this.sum += this.mass[i];
        }
        avg = this.sum / this.size;
        System.out.println("Среднееарифметическое массива равно: " + avg);
    }
}


