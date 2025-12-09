# Chinese Zodiac API

Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Javascript Wrapper for the [Chinese Zodiac API](https://apiverve.com/marketplace/chinesezodiac)

---

## Installation

Using npm:
```shell
npm install @apiverve/chinesezodiac
```

Using yarn:
```shell
yarn add @apiverve/chinesezodiac
```

---

## Configuration

Before using the Chinese Zodiac API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart)

The Chinese Zodiac API documentation is found here: [https://docs.apiverve.com/ref/chinesezodiac](https://docs.apiverve.com/ref/chinesezodiac).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const chinesezodiacAPI = require('@apiverve/chinesezodiac');
const api = new chinesezodiacAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  date: "1990-01-15"
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  date: "1990-01-15"
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  date: "1990-01-15"
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
}
```

---

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
