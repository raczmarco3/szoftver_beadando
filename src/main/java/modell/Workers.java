package modell;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "workers")
    public class Workers {

    private List<Worker> Workers;

    public List<Worker> getWorkers() {
        return Workers;
    }

    @XmlElement(name = "worker")
    public void setWorkers(List<Worker> Workers) {
        this.Workers = Workers;
    }

}
