package homework.EqualsHashcodeGenericsEnum;
import java.util.List;

public class LargeDataSet {
    private List<Double> data;

    public LargeDataSet(List<Double> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        int size = data.size();
        int previewCount = Math.min(5, size);
        List<Double> preview = data.subList(0, previewCount);

        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0;

        for (double d : data) {
            if (d < min) min = d;
            if (d > max) max = d;
            sum += d;
        }

        double avg = size > 0 ? sum / size : 0;

        return String.format(
                "LargeDataSet{size=%d, preview=%s, min=%.2f, max=%.2f, avg=%.2f}",
                size,
                preview.toString(),
                min,
                max,
                avg
        );
        }
    }


