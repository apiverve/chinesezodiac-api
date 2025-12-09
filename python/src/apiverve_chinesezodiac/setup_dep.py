from setuptools import setup, find_packages

setup(
    name='apiverve_chinesezodiac',
    version='1.1.12',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='Chinese Zodiac returns the zodiac animal, element, and characteristics for any birth date. Accurately accounts for the Chinese lunar calendar - the zodiac year starts on Chinese New Year, not January 1st.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
