
import java.util.Objects;

public class Pair{

	public Integer num_1;
	public Integer num_2;

	public Pair(Integer num_1, Integer num_2){
		this.num_1 = num_1;
		this.num_2 = num_2;
	}


	@Override 
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair pair = (Pair) o;
		return this.num_1.equals(pair.num_1) && this.num_2.equals(pair.num_2);
	}

	@Override 
	public int hashCode(){
		return Objects.hash(num_1, num_2);
	}
}