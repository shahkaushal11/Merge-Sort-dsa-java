class HashMapDemo {

    String[] name = new String[10];
    int[] roll = new int[10];

    void put(String studentName, int rollNo) {
        int index = rollNo % 10;

        name[index] = studentName;
        roll[index] = rollNo;
    }

    void display() {
        for (int i = 0; i < 10; i++) {
            if (name[i] != null) {
                System.out.println("Index: " + i +
                                   " Name: " + name[i] +
                                   " Roll No: " + roll[i]);
            }
        }
    }

    public static void main(String[] args) {

        HashMapDemo h = new HashMapDemo();

        h.put("Kaushal", 48);

        h.display();
    }
}
