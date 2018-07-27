package patrickcemper.cloudstarx.services;

import patrickcemper.cloudstarx.entities.Point;
import patrickcemper.cloudstarx.entities.Route;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RouteService {

    // create routes
    public static List<Route> createTestData() {
        List<Route> routes = new ArrayList<>();
        routes.add(createRoute1());
        routes.add(createRoute2());
        return routes;
    }

    private static Route createRoute1() {
        Route route = new Route("Route 1", "A very nice route to cycle to the Donauturm");
        Set<Point> points = new HashSet<>();
        points.add(new Point(route, 16.435674, 48.262917));
        points.add(new Point(route, 16.435965, 48.261526));
        points.add(new Point(route, 16.435858, 48.260080));
        points.add(new Point(route, 16.431464, 48.253706));
        points.add(new Point(route, 16.430188, 48.251272));
        points.add(new Point(route, 16.429833, 48.247848));
        points.add(new Point(route, 16.430186, 48.246406));
        points.add(new Point(route, 16.434490, 48.244750));
        points.add(new Point(route, 16.432441, 48.243228));
        points.add(new Point(route, 16.433079, 48.242732));
        points.add(new Point(route, 16.427686, 48.239734));
        points.add(new Point(route, 16.428870, 48.238785));
        points.add(new Point(route, 16.425186, 48.236854));
        points.add(new Point(route, 16.421465, 48.239814));
        points.add(new Point(route, 16.412133, 48.244117));
        points.add(new Point(route, 16.410977, 48.243035));
        points.add(new Point(route, 16.408856, 48.241934));
        points.add(new Point(route, 16.410072, 48.240652));
        route.setPoints(points);
        return route;
    }

    private static Route createRoute2() {
        Route route = new Route("Route 2", "My favourite running route when I need to burn off some energy.");
        Set<Point> points = new HashSet<>();
        points.add(new Point(route, 16.435380, 48.259139));
        points.add(new Point(route, 16.434803, 48.258395));
        points.add(new Point(route, 16.429428, 48.257367));
        points.add(new Point(route, 16.425900, 48.257621));
        points.add(new Point(route, 16.421412, 48.256819));
        points.add(new Point(route, 16.420590, 48.259930));
        points.add(new Point(route, 16.421422, 48.261668));
        points.add(new Point(route, 16.423659, 48.262144));
        points.add(new Point(route, 16.423810, 48.263234));
        points.add(new Point(route, 16.428196, 48.267078));
        points.add(new Point(route, 16.418387, 48.272168));
        points.add(new Point(route, 16.420305, 48.273952));
        points.add(new Point(route, 16.426091, 48.280972));
        points.add(new Point(route, 16.430025, 48.286355));
        points.add(new Point(route, 16.438876, 48.285393));
        points.add(new Point(route, 16.442988, 48.286217));
        points.add(new Point(route, 16.443430, 48.285338));
        points.add(new Point(route, 16.444582, 48.284849));
        points.add(new Point(route, 16.448869, 48.284498));
        points.add(new Point(route, 16.448303, 48.281733));
        points.add(new Point(route, 16.447821, 48.281636));
        points.add(new Point(route, 16.447234, 48.277209));
        points.add(new Point(route, 16.445451, 48.276734));
        points.add(new Point(route, 16.447904, 48.271407));
        points.add(new Point(route, 16.448302, 48.267023));
        points.add(new Point(route, 16.447652, 48.263935));
        points.add(new Point(route, 16.446808, 48.262386));
        points.add(new Point(route, 16.446920, 48.261991));
        points.add(new Point(route, 16.446303, 48.261617));
        points.add(new Point(route, 16.444710, 48.261665));
        points.add(new Point(route, 16.441147, 48.256385));
        points.add(new Point(route, 16.440377, 48.256199));
        points.add(new Point(route, 16.438190, 48.259373));
        points.add(new Point(route, 16.436934, 48.259232));
        route.setPoints(points);
        return route;
    }

}
