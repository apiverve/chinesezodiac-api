# Chinese Zodiac API - Ruby Gem

Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

## Installation

Add this line to your application's Gemfile:

```ruby
gem 'apiverve_chinesezodiac'
```

And then execute:

```bash
$ bundle install
```

Or install it yourself as:

```bash
$ gem install apiverve_chinesezodiac
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```ruby
require 'apiverve_chinesezodiac'

# Initialize the client
client = APIVerve::Chinesezodiac::Client.new(api_key: "YOUR_API_KEY")

# Make a request
response = client.execute({ date: "1990-01-15" })

# Print the response
puts response
```


### Error Handling

```ruby
begin
  response = client.execute({ date: "1990-01-15" })
  puts response["data"]
rescue APIVerve::Chinesezodiac::ValidationError => e
  puts "Validation error: #{e.errors.join(', ')}"
rescue APIVerve::Chinesezodiac::APIError => e
  puts "API error: #{e.message}"
  puts "Status code: #{e.status_code}"
end
```

### Debug Mode

```ruby
# Enable debug logging
client = APIVerve::Chinesezodiac::Client.new(
  api_key: "YOUR_API_KEY",
  debug: true
)
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

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/chinesezodiac?utm_source=rubygems&utm_medium=referral&utm_content=readme).

## Support

- Website: [https://apiverve.com/marketplace/chinesezodiac?utm_source=ruby&utm_medium=referral&utm_content=readme](https://apiverve.com/marketplace/chinesezodiac?utm_source=ruby&utm_medium=referral&utm_content=readme)
- Email: hello@apiverve.com

## License

This gem is available under the [MIT License](LICENSE).
