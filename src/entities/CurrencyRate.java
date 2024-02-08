package entities;


public class CurrencyRate {
	
		private float price;
		private int currrency;
		public CurrencyRate() {
			super();
		}
		public CurrencyRate(float price, int currrency) {
			super();
			this.price = price;
			this.currrency = currrency;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public int getCurrrency() {
			return currrency;
		}
		public void setCurrrency(int currrency) {
			this.currrency = currrency;
		}
		
}

