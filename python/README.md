Chinese Zodiac API
============

Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Python API Wrapper for the [Chinese Zodiac API](https://apiverve.com/marketplace/api/chinesezodiac)

---

## Installation
	pip install apiverve-chinesezodiac

---

## Configuration

Before using the chinesezodiac API client, you have to setup your account and obtain your API Key.  
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Usage

The Chinese Zodiac API documentation is found here: [https://docs.apiverve.com/api/chinesezodiac](https://docs.apiverve.com/api/chinesezodiac).  
You can find parameters, example responses, and status codes documented here.

### Setup

```
# Import the client module
from apiverve_chinesezodiac.apiClient import ChinesezodiacAPIClient

# Initialize the client with your APIVerve API key
api = ChinesezodiacAPIClient("[YOUR_API_KEY]")
```

---


### Perform Request
Using the API client, you can perform requests to the API.

###### Define Query

```
query = { "date": "1990-01-15" }
```

###### Simple Request

```
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

```
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

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2025 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.