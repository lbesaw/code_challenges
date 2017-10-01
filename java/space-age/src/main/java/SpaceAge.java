class SpaceAge {
    final int earthYear = 31557600;
    double seconds;
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds/earthYear;
    }

    double onMercury() {
        return seconds/(0.2408467*earthYear);
    }

    double onVenus() {
        return seconds/(0.61519726*earthYear);
    }

    double onMars() {
        return seconds/(1.8808158*earthYear);
    }

    double onJupiter() {
        return seconds/(11.862615*earthYear);
    }

    double onSaturn() {
        return seconds/(29.447498*earthYear);
    }

    double onUranus() {
        return seconds/(84.016846*earthYear);
    }

    double onNeptune() {
        return seconds/(164.79132*earthYear);
    }

}
