package cs601.shapes;

public class PlatonicSolid extends Shape3D{

	private int  numberOfEdgesForEachFace;
	private int  numberOfFacesMeetingAtEachVertex;
	private double  lengthOfTheEdge;
	
	public PlatonicSolid(int numberOfEdgesForEachFace, int numberOfFacesMeetingAtEachVertex, double lengthOfTheEdge) {
		// TODO Auto-generated constructor stub
		this.numberOfEdgesForEachFace = numberOfEdgesForEachFace;
		this.numberOfFacesMeetingAtEachVertex = numberOfFacesMeetingAtEachVertex;
		this.lengthOfTheEdge = lengthOfTheEdge;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double dihedralAngle;
		double inRadius;
		dihedralAngle  = 2*Math.asin(Math.cos(Math.PI / numberOfFacesMeetingAtEachVertex) / Math.sin(Math.PI / numberOfEdgesForEachFace));
		inRadius =  (lengthOfTheEdge / 2.0) * (1.0 / Math.tan(Math.PI / numberOfEdgesForEachFace)) * Math.tan(dihedralAngle / 2.0);
		return area() * inRadius / 3.0;
		
		/*
		if(numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 3){
			return 1.0*Math.sqrt(2)*lengthOfTheEdge*lengthOfTheEdge*lengthOfTheEdge/12;
		} else if (numberOfEdgesForEachFace == 4 && numberOfFacesMeetingAtEachVertex == 3) {
			return lengthOfTheEdge*lengthOfTheEdge*lengthOfTheEdge;
		} else if (numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 4) {
			return 1.0*Math.sqrt(2)*lengthOfTheEdge*lengthOfTheEdge*lengthOfTheEdge/3;
		} else if (numberOfEdgesForEachFace == 5 && numberOfFacesMeetingAtEachVertex == 3) {
			return (15 + 7.0*Math.sqrt(5))*lengthOfTheEdge*lengthOfTheEdge*lengthOfTheEdge/4;
		} else if (numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 5) {
			return (15 + 5.0*Math.sqrt(5))*lengthOfTheEdge*lengthOfTheEdge*lengthOfTheEdge/12;
		} else {
			return 0;
		}
		*/
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double faces;
		faces = (4*numberOfFacesMeetingAtEachVertex)/(4-(numberOfEdgesForEachFace-2)*(numberOfFacesMeetingAtEachVertex-2));
		return (1.0*lengthOfTheEdge*lengthOfTheEdge/4)*faces*numberOfEdgesForEachFace/(Math.tan(Math.PI/numberOfEdgesForEachFace));
		
		/*
		if(numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 3){
			return 1.0*Math.sqrt(3)*lengthOfTheEdge*lengthOfTheEdge;
		} else if (numberOfEdgesForEachFace == 4 && numberOfFacesMeetingAtEachVertex == 3) {
			return 6.0*lengthOfTheEdge*lengthOfTheEdge;
		} else if (numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 4) {
			return 2.0*Math.sqrt(3)*lengthOfTheEdge*lengthOfTheEdge;
		} else if (numberOfEdgesForEachFace == 5 && numberOfFacesMeetingAtEachVertex == 3) {
			return 3.0*Math.sqrt(25 + 10 * Math.sqrt(5))*lengthOfTheEdge*lengthOfTheEdge;
		} else if (numberOfEdgesForEachFace == 3 && numberOfFacesMeetingAtEachVertex == 5) {
			return 5.0*Math.sqrt(3)*lengthOfTheEdge*lengthOfTheEdge;
		} else {
			return 0;
		}
		*/
	}

	public int getNumberOfEdgesForEachFace() {
		return numberOfEdgesForEachFace;
	}

	public void setNumberOfEdgesForEachFace(int numberOfEdgesForEachFace) {
		this.numberOfEdgesForEachFace = numberOfEdgesForEachFace;
	}

	public int getNumberOfFacesMeetingAtEachVertex() {
		return numberOfFacesMeetingAtEachVertex;
	}

	public void setNumberOfFacesMeetingAtEachVertex(int numberOfFacesMeetingAtEachVertex) {
		this.numberOfFacesMeetingAtEachVertex = numberOfFacesMeetingAtEachVertex;
	}

	public double getLengthOfTheEdge() {
		return lengthOfTheEdge;
	}

	public void setLengthOfTheEdge(double lengthOfTheEdge) {
		this.lengthOfTheEdge = lengthOfTheEdge;
	}
}
