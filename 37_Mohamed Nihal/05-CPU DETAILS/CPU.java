package Program5;

public class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double Cache;
		public Processor(double cache)
		{
			Cache = cache;
		}
		double getCache() {
			return Cache;
		}
	}
	static class RAM {
		double memory,clockspeed;
		String manufacturer;
		RAM(double cs)
		{
			clockspeed = cs;
		}
		double getClockSpeed() {
			return clockspeed;
		}
	}
}
