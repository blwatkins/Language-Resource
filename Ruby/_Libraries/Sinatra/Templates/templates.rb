# ERB Templates

require 'sinatra'

get '/' do
	'Hello, World!'
end

get '/year' do
	template = 'The year is <%= Time.now.year %>'
	erb template
end

get '/date' do
	erb :date
end
