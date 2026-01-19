## Grade

[![Grade](https://img.shields.io/badge/Grade-85%25-green)](https://github.com/baraksu-class-2026/maman02-YotamOphir/actions/runs/21141860388) *(Original: 100%, Penalties: -15)*

## Tests

[📊 View Test Reports](https://github.com/baraksu-class-2026/maman02-YotamOphir/actions/runs/21141860388)

## AI Code Review

✅ **Code Quality: Excellent!**

Your project is well-structured, readable, and logically sound. Here are a couple of minor suggestions to help maintain these high standards:

- ❌ **Duplicate Code** (-10 points)
  - **Methods `checkIn`, `checkOut`, `findAvailableByBeds`, and `findRoomByNumber` in `Hotel`**:
    - These methods contain similar conditional logic for handling the same set of `HotelRoom` objects. Consider refactoring to reduce repetition by using helper methods or more efficient data structures.
    
- ❌ **Magic Numbers** (-5 points)
  - In `HotelRoom`: The numbers `99` and `1000` used within the `roomNumOk()` method should be replaced with named constants for clarity and easy adjustment, similar to constants used for default values.

Addressing the duplicate code and magic numbers will make your program more maintainable and easier to read and understand for others. Keep up the excellent work! Recommended adjusted grade: 85%
