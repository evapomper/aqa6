package Lesson_6;

import java.math.BigDecimal;
import java.util.List;

public class Park {
    private String name;
    List<Attraction> attractions;

    public Park(String name, List<Attraction> attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printParkInfo(Park park) {
        System.out.println("Название парка: " + park.getName());
        System.out.println("Список аттракционов: ");
        for (Attraction attraction : park.getAttractions()) {
            System.out.println("Название: " + attraction.getName() +
                    ", Расписание: " + attraction.getSchedule() +
                    ", Цена: " + attraction.getPrice());
        }
    }

    public static class Attraction {
        String name;
        BigDecimal price;
        String schedule;

        public Attraction(String name, BigDecimal price, String schedule) {
            this.name = name;
            this.price = price;
            this.schedule = schedule;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public String getSchedule() {
            return schedule;
        }

        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }

        @Override
        public String toString() {
            return String.format("Название: %s, Цена: %s, Расписание: %s", name, price, schedule);
        }
    }
}
