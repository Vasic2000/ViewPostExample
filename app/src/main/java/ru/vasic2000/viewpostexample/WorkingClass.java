package ru.vasic2000.viewpostexample;

class WorkingClass implements Runnable{
    private final MainActivity mainActivity;

    public WorkingClass(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainActivity.tvMain.post(new Runnable() {
            @Override
            public void run() {
                mainActivity.tvMain.setText("3 sec have passed");
            }
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainActivity.tvMain.post(new Runnable() {
            @Override
            public void run() {
                mainActivity.tvMain.setText("6 sec have passed");
            }
        });
    }
}
