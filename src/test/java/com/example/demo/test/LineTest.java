package com.example.demo.test;

import static com.example.demo.test.skel.PointImpl.p;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.demo.model.Line;
import com.example.demo.model.Point;

public class LineTest {
    
	@DataProvider(name="pointsAndLines")
    public Object[][] pointsAndLinesDataProvider() {
        return new Object[][] {
                {p(1.0, 1.0), new Line<Point>(p(0.0, 0.0), p(2.0, 0.0)), 1.0}, // horizontal line
                {p(1.0, 1.0), new Line<Point>(p(0.0, 0.0), p(0.0, 1.0)), 1.0}, // vertical line
                {p(1.0, 1.0), new Line<Point>(p(-1.0, 1.0), p(1.0, -1.0)), Math.sqrt(2)}, // sloped line
                {p(0.0, 0.0), new Line<Point>(p(-1.0, 1.0), p(1.0, -1.0)), 0.0}, // point is on the line
        };
    }
    
    @Test(dataProvider="pointsAndLines")
    public void shouldCalculateDistanceFromPointToLine(Point p, Line<Point> line, double expectedDistance) {
        double calculatedDistance = line.distance(p);
        Assert.assertTrue(Math.abs(expectedDistance - calculatedDistance) < 0.000000000000001);
    }
}
