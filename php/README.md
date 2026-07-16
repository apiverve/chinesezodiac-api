# Chinese Zodiac API - PHP Package

Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

## Installation

Install via Composer:

```bash
composer require apiverve/chinesezodiac
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```php
<?php

require_once 'vendor/autoload.php';

use APIVerve\Chinesezodiac\Client;

// Initialize the client
$client = new Client('YOUR_API_KEY');

// Make a request
$response = $client->execute(['date' => '1990-01-15']);

// Print the response
print_r($response);
```


### Error Handling

```php
use APIVerve\Chinesezodiac\Client;
use APIVerve\Chinesezodiac\Exceptions\APIException;
use APIVerve\Chinesezodiac\Exceptions\ValidationException;

try {
    $response = $client->execute(['date' => '1990-01-15']);
    print_r($response['data']);
} catch (ValidationException $e) {
    echo "Validation error: " . implode(', ', $e->getErrors());
} catch (APIException $e) {
    echo "API error: " . $e->getMessage();
    echo "Status code: " . $e->getStatusCode();
}
```

### Debug Mode

```php
// Enable debug logging
$client = new Client(
    apiKey: 'YOUR_API_KEY',
    debug: true
);
```

## Example Response

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

## Requirements

- PHP 7.4 or higher
- Guzzle HTTP client

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/chinesezodiac?utm_source=packagist&utm_medium=readme).

## Support

- Website: [https://apiverve.com/marketplace/chinesezodiac?utm_source=php&utm_medium=readme](https://apiverve.com/marketplace/chinesezodiac?utm_source=php&utm_medium=readme)
- Email: hello@apiverve.com

## License

This package is available under the [MIT License](LICENSE).
