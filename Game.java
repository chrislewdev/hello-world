import java.util.Random;

public class Game {
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    private int seven;
    private int eight;
    private int nine;
    private int ten;
    private int eleven;
    private int twelve;
    private int thirteen;
    private int forteen;
    private int fifteen;
    private int sixteen;

    public Game() {
        this.one = 0;
        this.two = 0;
        this.three = 0;
        this.four = 0;
        this.five = 0;
        this.six = 0;
        this.seven = 0;
        this.eight = 0;
        this.nine = 0;
        this.ten = 0;
        this.eleven = 0;
        this.twelve = 0;
        this.thirteen = 0;
        this.forteen = 0;
        this.fifteen = 0;
        this.sixteen = 0;
    }

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public int getThree() {
        return three;
    }

    public void setThree(int three) {
        this.three = three;
    }

    public int getFour() {
        return four;
    }

    public void setFour(int four) {
        this.four = four;
    }

    public int getFive() {
        return five;
    }

    public void setFive(int five) {
        this.five = five;
    }

    public int getSix() {
        return six;
    }

    public void setSix(int six) {
        this.six = six;
    }

    public int getSeven() {
        return seven;
    }

    public void setSeven(int seven) {
        this.seven = seven;
    }

    public int getEight() {
        return eight;
    }

    public void setEight(int eight) {
        this.eight = eight;
    }

    public int getNine() {
        return nine;
    }

    public void setNine(int nine) {
        this.nine = nine;
    }

    public int getTen() {
        return ten;
    }

    public void setTen(int ten) {
        this.ten = ten;
    }

    public int getEleven() {
        return eleven;
    }

    public void setEleven(int eleven) {
        this.eleven = eleven;
    }

    public int getTwelve() {
        return twelve;
    }

    public void setTwelve(int twelve) {
        this.twelve = twelve;
    }

    public int getThirteen() {
        return thirteen;
    }

    public void setThirteen(int thirteen) {
        this.thirteen = thirteen;
    }

    public int getForteen() {
        return forteen;
    }

    public void setForteen(int forteen) {
        this.forteen = forteen;
    }

    public int getFifteen() {
        return fifteen;
    }

    public void setFifteen(int fifteen) {
        this.fifteen = fifteen;
    }

    public int getSixteen() {
        return sixteen;
    }

    public void setSixteen(int sixteen) {
        this.sixteen = sixteen;
    }

    public void printCurrent() {
        System.out.println(this.one + " | " + this.two + " | " + this.three + " | " + this.four + "\n-------------\n"
                + this.five + " | " + this.six + " | " + this.seven + " | " + this.eight + "\n-------------\n"
                + this.nine + " | " + this.ten + " | " + this.eleven + " | " + this.twelve + "\n-------------\n"
                + this.thirteen + " | " + this.forteen + " | " + this.fifteen + " | " + this.sixteen );

        System.out.println("+++++++++++++++++++++++++++++");
    }

    public void moveLeft() {
        System.out.println("** MOVE LEFT **");

        Integer[] arrayRowOne = {this.getOne(), this.getTwo(), this.getThree(), this.getFour()};
        Integer[] arrayRowTwo = {this.getFive(), this.getSix(), this.getSeven(), this.getEight()};
        Integer[] arrayRowThree = {this.getNine(), this.getTen(), this.getEleven(), this.getTwelve()};
        Integer[] arrayRowFour = {this.getThirteen(), this.getForteen(), this.getFifteen(), this.getSixteen()};

        merge(arrayRowOne);
        merge(arrayRowTwo);
        merge(arrayRowThree);
        merge(arrayRowFour);

        setOne(arrayRowOne[0]);
        setTwo(arrayRowOne[1]);
        setThree(arrayRowOne[2]);
        setFour(arrayRowOne[3]);
        setFive(arrayRowTwo[0]);
        setSix(arrayRowTwo[1]);
        setSeven(arrayRowTwo[2]);
        setEight(arrayRowTwo[3]);
        setNine(arrayRowThree[0]);
        setTen(arrayRowThree[1]);
        setEleven(arrayRowThree[2]);
        setTwelve(arrayRowThree[3]);
        setThirteen(arrayRowFour[0]);
        setForteen(arrayRowFour[1]);
        setFifteen(arrayRowFour[2]);
        setSixteen(arrayRowFour[3]);

        sort(arrayRowOne);
        sort(arrayRowTwo);
        sort(arrayRowThree);
        sort(arrayRowFour);

        setOne(arrayRowOne[0]);
        setTwo(arrayRowOne[1]);
        setThree(arrayRowOne[2]);
        setFour(arrayRowOne[3]);
        setFive(arrayRowTwo[0]);
        setSix(arrayRowTwo[1]);
        setSeven(arrayRowTwo[2]);
        setEight(arrayRowTwo[3]);
        setNine(arrayRowThree[0]);
        setTen(arrayRowThree[1]);
        setEleven(arrayRowThree[2]);
        setTwelve(arrayRowThree[3]);
        setThirteen(arrayRowFour[0]);
        setForteen(arrayRowFour[1]);
        setFifteen(arrayRowFour[2]);
        setSixteen(arrayRowFour[3]);
    }

    public void moveRight() {
        System.out.println("** MOVE RIGHT **");

        Integer[] arrayRowOne = {this.getFour(), this.getThree(), this.getTwo(), this.getOne()};
        Integer[] arrayRowTwo = {this.getEight(), this.getSeven(), this.getSix(), this.getFive()};
        Integer[] arrayRowThree = {this.getTwelve(), this.getEleven(), this.getTen(), this.getNine()};
        Integer[] arrayRowFour = {this.getSixteen(), this.getFifteen(), this.getForteen(), this.getThirteen()};

        merge(arrayRowOne);
        merge(arrayRowTwo);
        merge(arrayRowThree);
        merge(arrayRowFour);

        setFour(arrayRowOne[0]);
        setThree(arrayRowOne[1]);
        setTwo(arrayRowOne[2]);
        setOne(arrayRowOne[3]);
        setEight(arrayRowTwo[0]);
        setSeven(arrayRowTwo[1]);
        setSix(arrayRowTwo[2]);
        setFive(arrayRowTwo[3]);
        setTwelve(arrayRowThree[0]);
        setEleven(arrayRowThree[1]);
        setTen(arrayRowThree[2]);
        setNine(arrayRowThree[3]);
        setSixteen(arrayRowFour[0]);
        setFifteen(arrayRowFour[1]);
        setForteen(arrayRowFour[2]);
        setThirteen(arrayRowFour[3]);

        sort(arrayRowOne);
        sort(arrayRowTwo);
        sort(arrayRowThree);
        sort(arrayRowFour);

        setFour(arrayRowOne[0]);
        setThree(arrayRowOne[1]);
        setTwo(arrayRowOne[2]);
        setOne(arrayRowOne[3]);
        setEight(arrayRowTwo[0]);
        setSeven(arrayRowTwo[1]);
        setSix(arrayRowTwo[2]);
        setFive(arrayRowTwo[3]);
        setTwelve(arrayRowThree[0]);
        setEleven(arrayRowThree[1]);
        setTen(arrayRowThree[2]);
        setNine(arrayRowThree[3]);
        setSixteen(arrayRowFour[0]);
        setFifteen(arrayRowFour[1]);
        setForteen(arrayRowFour[2]);
        setThirteen(arrayRowFour[3]);
    }


    private void merge(Integer[] array) {
        int boxA;
        for (boxA = 0; boxA < 3; boxA++) {
            //if boxA is not 0
            if (!array[boxA].equals(0)) {
                int nextBox = boxA+1;
                //loop through the next three boxes
                for (int boxB=nextBox; boxB < 4; boxB++) {
                    //if this box equals 0, go next box
                    if (array[boxB].equals(0)) {
                    } else {
                        //else check whether boxB equals boxA
                        //if yes, MERGE
                        if (array[boxB].equals(array[boxA])) {
                            array[boxA] = array[boxA] * 2;
                            array[boxB] = 0;
                            break;
                        } else {
                            //if no, no merge
                            break;
                        }
                    }
                }
            }
        }
    }

    public void moveUp() {
        System.out.println("** MOVE UP **");

        Integer[] arrayRowOne = {this.getOne(), this.getFive(), this.getNine(), this.getThirteen()};
        Integer[] arrayRowTwo = {this.getTwo(), this.getSix(), this.getTen(), this.getForteen()};
        Integer[] arrayRowThree = {this.getThree(), this.getSeven(), this.getEleven(), this.getFifteen()};
        Integer[] arrayRowFour = {this.getFour(), this.getEight(), this.getTwelve(), this.getSixteen()};

        merge(arrayRowOne);
        merge(arrayRowTwo);
        merge(arrayRowThree);
        merge(arrayRowFour);

        setOne(arrayRowOne[0]);
        setFive(arrayRowOne[1]);
        setNine(arrayRowOne[2]);
        setThirteen(arrayRowOne[3]);
        setTwo(arrayRowTwo[0]);
        setSix(arrayRowTwo[1]);
        setTen(arrayRowTwo[2]);
        setForteen(arrayRowTwo[3]);
        setThree(arrayRowThree[0]);
        setSeven(arrayRowThree[1]);
        setEleven(arrayRowThree[2]);
        setFifteen(arrayRowThree[3]);
        setFour(arrayRowFour[0]);
        setEight(arrayRowFour[1]);
        setTwelve(arrayRowFour[2]);
        setSixteen(arrayRowFour[3]);

        sort(arrayRowOne);
        sort(arrayRowTwo);
        sort(arrayRowThree);
        sort(arrayRowFour);

        setOne(arrayRowOne[0]);
        setFive(arrayRowOne[1]);
        setNine(arrayRowOne[2]);
        setThirteen(arrayRowOne[3]);
        setTwo(arrayRowTwo[0]);
        setSix(arrayRowTwo[1]);
        setTen(arrayRowTwo[2]);
        setForteen(arrayRowTwo[3]);
        setThree(arrayRowThree[0]);
        setSeven(arrayRowThree[1]);
        setEleven(arrayRowThree[2]);
        setFifteen(arrayRowThree[3]);
        setFour(arrayRowFour[0]);
        setEight(arrayRowFour[1]);
        setTwelve(arrayRowFour[2]);
        setSixteen(arrayRowFour[3]);
    }

    public void moveDown() {
        System.out.println("** MOVE DOWN **");

        Integer[] arrayRowOne = {this.getThirteen(), this.getNine(), this.getFive(), this.getOne()};
        Integer[] arrayRowTwo = {this.getForteen(), this.getTen(), this.getSix(), this.getTwo()};
        Integer[] arrayRowThree = {this.getFifteen(), this.getEleven(), this.getSeven(), this.getThree()};
        Integer[] arrayRowFour = {this.getSixteen(), this.getTwelve(), this.getEight(), this.getFour()};

        merge(arrayRowOne);
        merge(arrayRowTwo);
        merge(arrayRowThree);
        merge(arrayRowFour);

        setThirteen(arrayRowOne[0]);
        setNine(arrayRowOne[1]);
        setFive(arrayRowOne[2]);
        setOne(arrayRowOne[3]);
        setForteen(arrayRowTwo[0]);
        setTen(arrayRowTwo[1]);
        setSix(arrayRowTwo[2]);
        setTwo(arrayRowTwo[3]);
        setFifteen(arrayRowThree[0]);
        setEleven(arrayRowThree[1]);
        setSeven(arrayRowThree[2]);
        setThree(arrayRowThree[3]);
        setSixteen(arrayRowFour[0]);
        setTwelve(arrayRowFour[1]);
        setEight(arrayRowFour[2]);
        setFour(arrayRowFour[3]);


        sort(arrayRowOne);
        sort(arrayRowTwo);
        sort(arrayRowThree);
        sort(arrayRowFour);

        setThirteen(arrayRowOne[0]);
        setNine(arrayRowOne[1]);
        setFive(arrayRowOne[2]);
        setOne(arrayRowOne[3]);
        setForteen(arrayRowTwo[0]);
        setTen(arrayRowTwo[1]);
        setSix(arrayRowTwo[2]);
        setTwo(arrayRowTwo[3]);
        setFifteen(arrayRowThree[0]);
        setEleven(arrayRowThree[1]);
        setSeven(arrayRowThree[2]);
        setThree(arrayRowThree[3]);
        setSixteen(arrayRowFour[0]);
        setTwelve(arrayRowFour[1]);
        setEight(arrayRowFour[2]);
        setFour(arrayRowFour[3]);
    }

    private void sort(Integer[] array) {
        int boxA;
        for (boxA = 0; boxA < 3; boxA++) {
            //if boxA is 0
            if (array[boxA].equals(0)) {
                int nextBox = boxA+1;
                //loop through the next three boxes
                for (int boxB=nextBox; boxB < 4; boxB++) {
                    //if this box not equals 0
                    //MOVE
                    if (!array[boxB].equals(0)) {
                        array[boxA] = array[boxB];
                        array[boxB] = 0;
                        break;
                    }
                }
            }
        }
    }

    private int getRandom() {
        Random rand = new Random();
        int chosen = rand.nextInt(15);
        return chosen;
    }

    public void generateNew() {
        System.out.println("** NEXT ROUND **");

        Integer[] array = {this.getOne(), this.getTwo(), this.getThree(), this.getFour(),
                this.getFive(), this.getSix(), this.getSeven(), this.getEight(),
                this.getNine(), this.getTen(), this.getEleven(), this.getTwelve(),
                this.getThirteen(), this.getForteen(), this.getFifteen(), this.getSixteen()};

        boolean quit = false;
        while (!quit) {
            int chosen = getRandom();
            if (!array[chosen].equals(0)) {
            } else {
                array[chosen] = 2;
                quit = true;
            }
        }

        boolean quit2 = false;
        while (!quit2) {
            int chosen2 = getRandom();
            if (!array[chosen2].equals(0)) {
            } else {
                array[chosen2] = 2;
                quit2 = true;
            }
        }

        setOne(array[0]);
        setTwo(array[1]);
        setThree(array[2]);
        setFour(array[3]);
        setFive(array[4]);
        setSix(array[5]);
        setSeven(array[6]);
        setEight(array[7]);
        setNine(array[8]);
        setTen(array[9]);
        setEleven(array[10]);
        setTwelve(array[11]);
        setThirteen(array[12]);
        setForteen(array[13]);
        setFifteen(array[14]);
        setSixteen(array[15]);
    }

    public void gameStartRandom() {
        System.out.println("** GAME START **");

        Integer[] array = {this.getOne(), this.getTwo(), this.getThree(), this.getFour(),
                this.getFive(), this.getSix(), this.getSeven(), this.getEight(),
                this.getNine(), this.getTen(), this.getEleven(), this.getTwelve(),
                this.getThirteen(), this.getForteen(), this.getFifteen(), this.getSixteen()};

        int chosen1 = getRandom();
        int chosen2 = getRandom();

        while (chosen2 == chosen1) {
            chosen2 = getRandom();
            if (chosen2 != chosen1) {
                break;
            }
        }

        array[chosen1] = 2;
        array[chosen2] = 2;

        setOne(array[0]);
        setTwo(array[1]);
        setThree(array[2]);
        setFour(array[3]);
        setFive(array[4]);
        setSix(array[5]);
        setSeven(array[6]);
        setEight(array[7]);
        setNine(array[8]);
        setTen(array[9]);
        setEleven(array[10]);
        setTwelve(array[11]);
        setThirteen(array[12]);
        setForteen(array[13]);
        setFifteen(array[14]);
        setSixteen(array[15]);
    }
}