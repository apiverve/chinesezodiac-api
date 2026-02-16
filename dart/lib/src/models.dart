/// Response models for the Chinese Zodiac API.

/// API Response wrapper.
class ChinesezodiacResponse {
  final String status;
  final dynamic error;
  final ChinesezodiacData? data;

  ChinesezodiacResponse({
    required this.status,
    this.error,
    this.data,
  });

  factory ChinesezodiacResponse.fromJson(Map<String, dynamic> json) => ChinesezodiacResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? ChinesezodiacData.fromJson(json['data']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
  };
}

/// Response data for the Chinese Zodiac API.

class ChinesezodiacData {
  String? date;
  int? zodiacYear;
  String? animal;
  String? animalChinese;
  String? element;
  String? elementChinese;
  String? elementColor;
  String? polarity;
  List<String>? traits;
  int? sexagenaryCyclePosition;
  String? fullName;
  String? chineseNewYear;

  ChinesezodiacData({
    this.date,
    this.zodiacYear,
    this.animal,
    this.animalChinese,
    this.element,
    this.elementChinese,
    this.elementColor,
    this.polarity,
    this.traits,
    this.sexagenaryCyclePosition,
    this.fullName,
    this.chineseNewYear,
  });

  factory ChinesezodiacData.fromJson(Map<String, dynamic> json) => ChinesezodiacData(
      date: json['date'],
      zodiacYear: json['zodiacYear'],
      animal: json['animal'],
      animalChinese: json['animalChinese'],
      element: json['element'],
      elementChinese: json['elementChinese'],
      elementColor: json['elementColor'],
      polarity: json['polarity'],
      traits: (json['traits'] as List?)?.cast<String>(),
      sexagenaryCyclePosition: json['sexagenaryCyclePosition'],
      fullName: json['fullName'],
      chineseNewYear: json['chineseNewYear'],
    );
}

class ChinesezodiacRequest {
  String date;

  ChinesezodiacRequest({
    required this.date,
  });

  Map<String, dynamic> toJson() => {
      'date': date,
    };
}
