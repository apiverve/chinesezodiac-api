# Chinese Zodiac API - Dart/Flutter Client

Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

[![pub package](https://img.shields.io/pub/v/apiverve_chinesezodiac.svg)](https://pub.dev/packages/apiverve_chinesezodiac)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is the Dart/Flutter client for the [Chinese Zodiac API](https://apiverve.com/marketplace/chinesezodiac?utm_source=dart&utm_medium=readme).

## Installation

Add this to your `pubspec.yaml`:

```yaml
dependencies:
  apiverve_chinesezodiac: ^1.1.14
```

Then run:

```bash
dart pub get
# or for Flutter
flutter pub get
```

## Usage

```dart
import 'package:apiverve_chinesezodiac/apiverve_chinesezodiac.dart';

void main() async {
  final client = ChinesezodiacClient('YOUR_API_KEY');

  try {
    final response = await client.execute({
      'date': '1990-01-15'
    });

    print('Status: ${response.status}');
    print('Data: ${response.data}');
  } catch (e) {
    print('Error: $e');
  }
}
```

## Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "date": "1990-01-15",
    "zodiacYear": 1989,
    "animal": "Snake",
    "animalChinese": "蛇",
    "element": "Earth",
    "elementChinese": "土",
    "elementColor": "Yellow/Brown",
    "polarity": "Yin",
    "traits": [
      "Enigmatic",
      "Intelligent",
      "Wise",
      "Decisive"
    ],
    "sexagenaryCyclePosition": 6,
    "fullName": "Earth Snake",
    "chineseNewYear": "1990-01-27"
  }
}
```

## API Reference

- **API Home:** [Chinese Zodiac API](https://apiverve.com/marketplace/chinesezodiac?utm_source=dart&utm_medium=readme)
- **Documentation:** [docs.apiverve.com/ref/chinesezodiac](https://docs.apiverve.com/ref/chinesezodiac?utm_source=dart&utm_medium=readme)

## Authentication

All requests require an API key. Get yours at [apiverve.com](https://apiverve.com?utm_source=dart&utm_medium=readme).

## License

MIT License - see [LICENSE](LICENSE) for details.

---

Built with Dart for [APIVerve](https://apiverve.com?utm_source=dart&utm_medium=readme)
