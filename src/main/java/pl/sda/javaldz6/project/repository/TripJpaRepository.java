package pl.sda.javaldz6.project.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import pl.sda.javaldz6.project.model.Trip;
import pl.sda.javaldz6.project.model.TripQueryParams;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;


@Repository
public interface TripJpaRepository extends JpaRepository<Trip, Long>, JpaSpecificationExecutor<Trip> {

    class Specifications {
        public static Specification<Trip> conditions(TripQueryParams params) {

            return ((root, query, cb) -> {
                Predicate result = cb.conjunction();
                if (params.getPriceAdult() != null) {
                    Predicate priceAdultEq = cb.equal(root.get("priceForAdult"), params.getPriceAdult());
                    result = cb.and(result, priceAdultEq);
                }
                if (params.getPriceChild() != null) {
                    Predicate priceChildEq = cb.equal(root.get("priceForChild"), params.getPriceChild());
                    result = cb.and(result, priceChildEq);
                }

                if (params.getAirportFrom() != null) {
                    Predicate airportFromEq = cb.equal(root.get("airportFrom"), params.getAirportFrom());
                    result = cb.and(result, airportFromEq);
                }

                if (params.getAirportTo() != null) {
                    Predicate airportToEq = cb.equal(root.get("airportTo"), params.getAirportTo());
                    result = cb.and(result, airportToEq);
                }
                if (params.getHotelTo() != null) {
                    Predicate hotelToEq = cb.equal(root.get("hotelTo"), params.getHotelTo());
                    result = cb.and(result, hotelToEq);
                }
                if (params.getCityTo() != null) {
                    Predicate cityToEq = cb.equal(root.get("cityTo"), params.getCityTo());
                    result = cb.and(result, cityToEq);
                }
                if (params.getDepartureDate() != null) {
                    Predicate departureDateEq = cb.equal(root.get("departureDate"), params.getDepartureDate());
                    result = cb.and(result, departureDateEq);
                }
               if (params.getReturnDate() != null) {
                    Predicate returnDateEq = cb.equal(root.get("returnDate"), params.getReturnDate());
                    result = cb.and(result, returnDateEq);
                }
               if (params.getCountOfDays() != null) {
                    Predicate countOfDaysEq = cb.equal(root.get("countOfDays"), params.getCountOfDays());
                    result = cb.and(result, countOfDaysEq);
                }


                return result;
            });
        }
    }

    default List<Trip> getTripsByParam(TripQueryParams params) {
        return this.findAll(Specifications.conditions(params));
    }
}
