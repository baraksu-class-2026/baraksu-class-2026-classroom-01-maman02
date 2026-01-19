## AI Code Review

Let's review the provided files for potential issues.

--- File: ./Hotel.java ---

❌ **Duplicate Code** (-10 points)
- There is repetitive logic in the `checkIn`, `checkOut`, and `findAvailableByBeds` methods where similar checks and operations (comparing room numbers and bed numbers, checking occupancy) are performed on the `HotelRoom` objects. This repeated code could be refactored into a shared method to streamline the logic and reduce duplication.

No other issues found in this file.

--- File: ./HotelRoom.java ---

The implementation appears to be correct, and no issues require code changes within this file.

Therefore, your main focus should be on reducing the duplicate code in the `Hotel` class methods to increase maintainability and readability. Keep up the good work on understanding your program's structure and logic!

Recommended adjusted grade: 90%
