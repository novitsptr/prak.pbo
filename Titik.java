class Titik  //tinggal melengkapi 3 konstruktor lain
{
	int x;
	int y;

	// konstruktor default
	public Titik(){
		System.out.println("Konstruktor titik dijalankan!");
		x=0;
		y=0;
	}

	//copy contructor
	public Titik(int x1, int y1){
		this.x=x1;
		this.y=y1;
	}

	public void show_xy(int x2, int y2){
		System.out.println("Titik x1 dan y2 ("+x2+ ","+y2+")");
	}

	public void calculate_xy(int x2, int y2){
		System.out.println("Titik x1 dan Y2 ("+(x2+x2)+","+(y2+y2)+")");
	}

	public void square_xy(int x2, int y2){
		System.out.println("Kuadrat titik x1 dan y2 "+(x2*x2)+","+(y2*y2)+")");
	}

		//hanya tampilkan
		public void info(){
			System.out.println("Titiknya ("+x+" , "+y+")");
		}
	}