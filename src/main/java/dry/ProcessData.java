package dry;

public class ProcessData {

    public void processDayData() {
        processData("morning");
        processData("afternoon");
        processData("evening");
    }

    private void processData(String partOfDay) {
        extractData(partOfDay);
        transformData(partOfDay);
        loadData(partOfDay);
    }

    public void extractData (String daytime) {

    }

    public void transformData(String daytime) {

    }

    public void loadData(String daytime) {

    }
}
