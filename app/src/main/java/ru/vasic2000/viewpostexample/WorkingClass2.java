package ru.vasic2000.viewpostexample;

class WorkingClass2 implements Runnable{
    private final MainActivity mainActivity;

    public WorkingClass2(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mainActivity.tvMain2.setText("OU!!!");
            }
        });

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mainActivity.tvMain2.setText("OU! OU!! OU!!!");
            }
        });
    }
}
