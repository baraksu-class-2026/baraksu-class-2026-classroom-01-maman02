## Grade

[![Grade](https://img.shields.io/badge/Grade-0%25-red)](https://github.com/baraksu-class-2026/maman02-YotamOphir/actions/runs/21147377825)

## Tests

[📊 View Test Reports](https://github.com/baraksu-class-2026/maman02-YotamOphir/actions/runs/21147377825)

## AI Code Review

### Feedback for `Hotel.java`:

❌ **Duplicate Code** (-10 points)

- The methods `checkIn`, `checkOut`, and `findAvailableByBeds` in `Hotel` exhibit similar logic when checking room numbers and occupancy status. Shared logic should be extracted and reused across these methods to avoid duplication.
  
- Consider integrating the similar sequence of operations in `findRoomByNumber` and the mentioned methods to streamline room retrieval logic.

### Feedback for `HotelRoom.java`:

- ✅ **Code Quality: Excellent!** No issues with magic numbers, syntax, or brace usage in this file. Constants are used appropriately, and the logic is well-structured and readable.

### Overall Recommendation:
- Revise to eliminate duplicate code in the `Hotel` class by considering common utility methods or logical restructuring. This will improve maintainability and readability of your code. 
- Adjusted grade: 90%
