package ua.com.alevel.res;

import ua.com.alevel.BaseType;

import java.util.List;

public class ResponseContainer<D extends BaseType, S> {

    private List<D> data;
    private S status;

    public List<D> getData() {
        return data;
    }

    public void setData(List<D> data) {
        this.data = data;
    }

    public S getStatus() {
        return status;
    }

    public void setStatus(S status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseContainer{" +
                "data=" + data +
                ", status=" + status +
                '}';
    }
}
