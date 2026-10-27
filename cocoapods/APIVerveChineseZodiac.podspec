Pod::Spec.new do |s|
  s.name             = 'APIVerveChineseZodiac'
  s.version          = '1.2.3'
  s.summary          = 'Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date.'
  s.description      = <<-'DESC'
Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.

This iOS/macOS SDK provides a convenient way to access the Chinese Zodiac from APIVerve.
Supports both callback-based and async/await patterns.
                       DESC

  s.homepage         = 'https://apiverve.com/marketplace/chinesezodiac?utm_source=cocoapods&utm_medium=referral&utm_content=homepage'
  s.license          = { :type => 'MIT', :file => 'LICENSE' }
  s.author           = { 'APIVerve' => 'hello@apiverve.com' }
  # The SDK repo holds every language; the pod lives under cocoapods/ with its own tag.
  s.source           = { :git => 'https://github.com/apiverve/chinesezodiac-api.git', :tag => "cocoapods/v#{s.version}" }

  s.ios.deployment_target = '15.0'
  s.osx.deployment_target = '12.0'

  s.swift_version = '5.0'

  s.source_files = 'cocoapods/Sources/APIVerveChineseZodiac/**/*.swift'

  s.frameworks = 'Foundation'

  # APIResponse, APIVerveError and the request plumbing, shared by every APIVerve pod.
  s.dependency 'APIVerveCore', '~> 1.2'
end
