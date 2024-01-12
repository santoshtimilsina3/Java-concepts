package Fields;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
//        getFields(Movie.MovieStat.class);
//        getFields(Movie.class);
        getFields(Category.class);
    }

    private static void getFields(Class<?> tClass) {
        Field[] declaredFields = tClass.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println("name == " + f.getName());
            System.out.println("type == " + f.getType().getName());
            System.out.println("is synthetic == " + f.isSynthetic());
        }

    }

    public static class Product {
        private String name;
        private Double price;
        private int year;

    }

    public static class Movie extends Product {
        private static final double MINIMUM_PRICE = 10.99;
        private boolean isReleased;
        private Category category;
        private double actualPrice;

        public Movie(boolean isReleased, Category category, double actualPrice) {
            this.isReleased = isReleased;
            this.category = category;
            this.actualPrice = actualPrice;
        }

        public class MovieStat {
            private int timeWatched;

            public double revenueCalculate() {
                return timeWatched * actualPrice;
            }
        }
    }

    public enum Category {
        ADVENTURE, ROMANCE, COMEDY
    }
}
