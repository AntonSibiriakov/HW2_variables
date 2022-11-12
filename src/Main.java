public class Main {
    public static void main(String[] args) {
        var dog = 8;
        dog += 4;
        dog -= 3.5;

        var cat = 3.6;
        cat += 4;
        cat -=1.6;

        var paper = 763789;
        paper += 4;
        paper -= 7639;

        var friend = 19;
        friend += 2;
        friend /= 7;

        var frog = 3.5;
        frog *= 10;
        frog /= 3.5;
        frog += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(friend);
        System.out.println(frog);


        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var totalWeightBoxer = weightOneBoxer + weightTwoBoxer;
        var differenceWeightBoxer = weightTwoBoxer - weightOneBoxer;
        var differenceWeightBoxer0 = weightTwoBoxer % weightOneBoxer;

        System.out.println("Общий вес боксеров " + totalWeightBoxer + "кг.");
        System.out.println("Разница веса боксеров(+-) " + differenceWeightBoxer + "кг.");
        System.out.println("Разница веса боксеров(%) " + differenceWeightBoxer0 + "кг.");


        var totalHours = 640;
        var hoursOneWorker = 8;
        var totalWorker = totalHours / hoursOneWorker;
        System.out.println("Всего работников в компании - " + totalWorker + " человек");


        totalWorker += 94;
        totalHours = totalWorker * hoursOneWorker;
        System.out.println("Если в компании работает " + totalWorker + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками");



    }
}