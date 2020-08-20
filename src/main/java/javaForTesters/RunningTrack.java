package javaForTesters;

public class RunningTrack extends Barrier {
    private int length;

    public RunningTrack(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка " + super.getName() + " длина: "+ " " + this.length);

        actions.run();

        if (getLength() <= actions.getRunningDistance()) {
            System.out.println("Успешный бег");

            return true;
        } else {
            System.out.println("Безуспешный бег");

            return false;
        }
    }
}
