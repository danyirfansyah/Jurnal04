public class Data {
    String mataKuliah;
    String tugas;
    String deadlineTugas;

    public Data(String mataKuliah, String tugas, String deadlineTugas) {
        this.mataKuliah = mataKuliah;
        this.tugas = tugas;
        this.deadlineTugas = deadlineTugas;
    }

    @Override
    public String toString() {
        return "Mata Kuliah = " + mataKuliah + ", tugas = " + tugas + ", deadlineTugas = " + deadlineTugas;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getTugas() {
        return tugas;
    }
}